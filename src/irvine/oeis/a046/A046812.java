package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046812 Number of prime anagrams of A046811(n).
 * @author Sean A. Irvine
 */
public class A046812 extends A046811 {

  @Override
  public Z next() {
    return Z.valueOf(A046810.numberOfPrimeAnagrams(super.next().toString()));
  }
}
