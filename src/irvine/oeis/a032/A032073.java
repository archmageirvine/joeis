package irvine.oeis.a032;

import java.util.ArrayList;
import java.util.List;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032073.
 * @author Sean A. Irvine
 */
public class A032073 implements Sequence {

  // todo this is a long way from working ...

  private static final MemoryFactorial F = new MemoryFactorial();

  Q t(final List<Q> a, final int n) {
    final IntegerPartition part = new IntegerPartition(n);
    Q sum = Q.ONE; //Q.ZERO;
    int[] p;
    final int[] q = new int[n + 1];
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, q);
      int odd = 0;
      Q t1 = Q.ONE;
      Q t2 = Q.ONE;
      Q d = Q.ONE;
      t1 = t1.multiply(F.factorial(p.length));
      t2 = t2.multiply(F.factorial(p.length / 2));
      for (int i = 1; i < q.length; ++i) {
        if (q[i] != 0) {
          if ((q[i] & 1) == 1) {
            ++odd;
          }
          t1 = t1.multiply(a.get(i).pow(q[i])).divide(F.factorial(q[i]));
//          if ((p.length & 1) == 0 && (q[i] & 1) == 0) {
            t2 = t2.multiply(a.get(i).pow(q[i] / 2)).divide(F.factorial(q[i] / 2));
 //         }
          //d = d.multiply(F.factorial(i).multiply(q[i]));
          d = d.multiply(F.factorial(i).pow(q[i]));
          //d = d.multiply(F.factorial(q[i]).multiply(i));
        }
      }
      // todo the following subtraction is what sometimes causes 0's in result
      final Q t3 = odd > 1 ? t1 : t1.subtract(t2);
      //final Q t3 = odd > 1 ? t1 : t1.add(t2);
      final Q t = t3.multiply(F.factorial(n)).divide(d).divide(2);
      //System.out.println(n + " " + Arrays.toString(p) + " " + Arrays.toString(q) + " k=" + p.length + " t=" + t + " t1=" + t1 + " t2=" + t2 + " #odd=" + odd);
      sum = sum.add(t);
    }
    return sum;
  }

  List<Q> bhj(final List<Q> a) {
    System.out.println("input=" + a);
    final ArrayList<Q> res = new ArrayList<>(a.size());
    res.add(a.get(0));
    for (int k = 1; k < a.size(); ++k) {
      res.add(t(a, k));
    }
    return res;
  }

  private final ArrayList<Q> mA = new ArrayList<>();
  {
    mA.add(null);
  }

  @Override
  public Z next() {
    mA.add(Q.ONE);
    final List<Q> bhj = bhj(mA);
    System.out.println("bhj=" + bhj);
    return bhj.get(mA.size() - 1).toZ();
  }
}
