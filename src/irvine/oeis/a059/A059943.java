package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059943 Toss a fair coin and calculate the expected time until the n-th possible finite sequence of Heads and Tails first appears (ordered by length of sequence and alphabetical order so H, T, HH, HT, TH, TT, HHH, etc.).
 * @author Sean A. Irvine
 */
public class A059943 extends A059942 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
