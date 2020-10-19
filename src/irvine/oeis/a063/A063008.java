package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A063008 Canonical partition sequence (see A080577) encoded by prime factorization. The partition [p1,p2,p3,...] with p1 &gt;= p2 &gt;= p3 &gt;= ... is encoded as 2^p1 * 3^p2 * 5^p3 * ... .
 * @author Sean A. Irvine
 */
public class A063008 implements Sequence {

  private static final Fast mPrime = new Fast();
  private int mN = 1;
  private IntegerPartition mIntegerPartition = null;

  @Override
  public Z next() {
    if (mIntegerPartition == null) {
      mIntegerPartition = new IntegerPartition(1);
      return Z.ONE;
    }
    int[] part = mIntegerPartition.next();
    if (part == null) {
      mIntegerPartition = new IntegerPartition(++mN);
      part = mIntegerPartition.next();
    }
    Z prod = Z.ONE;
    Z p = Z.TWO;
    for (final int v : part) {
      prod = prod.multiply(p.pow(v));
      p = mPrime.nextPrime(p);
    }
    return prod;
  }
}

