package irvine.oeis.a008;

import java.util.ArrayList;

import irvine.math.LongUtils;
import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008783 Period of continued fraction representation of (sqrt(4n+1)+1)/2=sqrt(n+sqrt(n+sqrt(n+...))).
 * @author Sean A. Irvine
 */
public class A008783 extends Sequence1 {

  private static final int REQUIRED_REPEATS = 5; // heuristic
  private long mN = 0;

  private static int findPeriod(final CR n) {
    final ArrayList<Z> cf = new ArrayList<>();
    final Convergents conv = new Convergents(n);
    boolean nonUnit = false;
    conv.next(); // skip leading term
    while (true) {
      conv.next();
      final Z t = conv.frac();
      if (!cf.isEmpty() && !t.equals(Z.ONE)) {
        nonUnit = true;
      }
      cf.add(t);
      //System.out.println(cf);
      if ((cf.size() % REQUIRED_REPEATS) == 0) {
        final int potentialPeriod = cf.size() / REQUIRED_REPEATS;
        if (nonUnit && potentialPeriod > 1) {
          boolean ok = true;
          for (int i = 0; i < potentialPeriod; ++i) {
            for (int k = REQUIRED_REPEATS - 1; k > 0; --k) {
              if (!cf.get(i).equals(cf.get(k * potentialPeriod + i))) {
                ok = false;
                break;
              }
            }
          }
          if (ok) {
            return potentialPeriod;
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    final long m = 4 * mN + 1;
    final long s = LongUtils.sqrt(m);
    if (s * s == m) {
      return Z.ZERO;
    }
    final long t = LongUtils.sqrt(m - 4);
    if (t * t == m - 4) {
      return Z.ONE;
    }
    final CR n = CR.valueOf(m).sqrt().add(CR.ONE).divide(CR.TWO);
    return Z.valueOf(findPeriod(n));
  }
}
