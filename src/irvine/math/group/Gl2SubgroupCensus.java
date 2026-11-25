package irvine.math.group;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.group.Gl2SubgroupLift.Count;
import irvine.math.group.Gl2SubgroupModel.Group;
import irvine.math.group.Gl2SubgroupModel.Subgroup;
import irvine.math.group.Gl2SubgroupProduct.Local;
import irvine.math.z.Z;

/**
 * Subgroup counts over degree-two residue rings.
 * @author Gregory Morse
 */
public final class Gl2SubgroupCensus {

  private final Map<Integer, Local> mLocal = new HashMap<>();

  private Local local(final int modulus) {
    final Local cached = mLocal.get(modulus);
    if (cached != null) {
      return cached;
    }
    final FactorSequence fs = Jaguar.factor(modulus);
    final Z[] primes = fs.toZArray();
    final Group group = new Group(modulus, false);
    final Local result;
    if (primes.length == 1) {
      final int p = primes[0].intValueExact();
      if (p == modulus) {
        result = new Local(group, Gl2PrimeSubgroups.classes(p), p);
      } else {
        final Local base = local(modulus / p);
        final Gl2SubgroupLift lift = new Gl2SubgroupLift(p, base.mGroup, group);
        final List<Subgroup> classes = new ArrayList<>();
        for (final Subgroup projection : base.mClasses) {
          classes.addAll(lift.count(projection, true, true).mClasses);
        }
        result = new Local(group, classes, p);
      }
    } else {
      result = new Local(group, Gl2SubgroupModel.small(group), 0);
    }
    mLocal.put(modulus, result);
    return result;
  }

  private static long fromClasses(final Local local, final boolean conjugacy) {
    if (conjugacy) {
      return local.mClasses.size();
    }
    long total = 0;
    for (final Subgroup s : local.mClasses) {
      total += local.mGroup.mOrder / s.mNormalizerOrder;
    }
    return total;
  }

  /**
   * Count subgroups or subgroup conjugacy classes of GL(2,Z/nZ).
   * @param modulus positive modulus
   * @param conjugacy whether to count up to conjugacy
   * @return number of subgroups or classes
   */
  public Z count(final int modulus, final boolean conjugacy) {
    if (modulus == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(modulus);
    final Z[] primes = fs.toZArray();
    if (primes.length > 1) {
      final Z p = primes[primes.length - 1];
      final int power = p.pow(fs.getExponent(p)).intValueExact();
      return Z.valueOf(Gl2SubgroupProduct.count(local(power), local(modulus / power), conjugacy));
    }
    final int prime = primes[0].intValueExact();
    if (prime == modulus || modulus <= 9) {
      return Z.valueOf(fromClasses(local(modulus), conjugacy));
    }
    final Local base = local(modulus / prime);
    final Gl2SubgroupLift lift = new Gl2SubgroupLift(prime, base.mGroup, new Group(modulus, false));
    long answer = 0;
    for (final Subgroup projection : base.mClasses) {
      final Count census = lift.count(projection, conjugacy, false);
      answer += conjugacy ? census.mClasses.size() : census.mCount;
    }
    return Z.valueOf(answer);
  }
}
