package irvine.oeis.a333;

import irvine.oeis.NoncomputableSequence;

/**
 * A333479 Busy Beaver for lambda calculus BBλ: the maximum beta normal form size of any closed lambda term of size n, or 0 if no closed term of size n exists.
 * @author Gregory Morse
 */
public class A333479 extends NoncomputableSequence {
  // Known maxima; see John Tromp's binary lambda calculus computation in the OEIS entry.
  /** Construct the sequence. */
  public A333479() {
    super(1, NONCOMPUTABLE, "0,0,0,4,0,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,22,24,26,30,42,52,44,58,223,160,267,298,1812,327686,38127987424941,578960446186580977117854925043439539266349923328202820197287920039565648199686");
  }
}
