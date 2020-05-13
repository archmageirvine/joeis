package irvine.oeis.a032;

import java.util.ArrayList;
import java.util.List;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032073.
 * @author Sean A. Irvine
 */
public class A032073 implements Sequence {

  private static final MemoryFactorial F = new MemoryFactorial();

  Z t(final List<Z> a, final int n) {
    final IntegerPartition part = new IntegerPartition(n);
    Z sum = Z.ONE;
    int[] p;
    final int[] q = new int[n + 1];
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, q);
      int odd = 0;
      Z d = Z.ONE;
      Z t1 = F.factorial(p.length);
      Z t2 = F.factorial(p.length / 2);
      for (int i = 1; i < q.length; ++i) {
        if (q[i] != 0) {
          if ((q[i] & 1) == 1) {
            ++odd;
          }
          t1 = t1.multiply(a.get(i).pow(q[i])).divide(F.factorial(q[i]));
          t2 = t2.multiply(a.get(i).pow(q[i] / 2)).divide(F.factorial(q[i] / 2));
          d = d.multiply(F.factorial(i).pow(q[i]));
        }
      }
      final Z t3 = odd > 1 ? t1 : t1.subtract(t2);
      final Z t = t3.multiply(F.factorial(n)).divide(d).divide(2);
      //System.out.println(n + " " + Arrays.toString(p) + " " + Arrays.toString(q) + " k=" + p.length + " t=" + t + " t1=" + t1 + " t2=" + t2 + " #odd=" + odd);
      sum = sum.add(t);
    }
    return sum;
  }

  List<Z> bhj(final List<Z> a) {
    //System.out.println("input=" + a);
    final ArrayList<Z> res = new ArrayList<>(a.size());
    res.add(a.get(0));
    for (int k = 1; k < a.size(); ++k) {
      res.add(t(a, k));
    }
    return res;
  }

  private final ArrayList<Z> mA = new ArrayList<>();
  {
    mA.add(null);
  }

  @Override
  public Z next() {
    mA.add(Z.ONE);
    final List<Z> bhj = bhj(mA);
    //System.out.println("bhj=" + bhj);
    return bhj.get(mA.size() - 1);
  }
}
