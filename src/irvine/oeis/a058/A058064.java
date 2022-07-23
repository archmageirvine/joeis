package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a057.A057856;

/**
 * A058064 Find least k such that (n+1)^k + n^k is a prime (A057856); then k=2^m and sequence gives values of m.
 * @author Sean A. Irvine
 */
public class A058064 extends A057856 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitLength() - 1);
  }
}

