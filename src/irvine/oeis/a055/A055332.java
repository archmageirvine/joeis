package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055332 Number of rooted identity trees with n nodes and 7 leaves.
 * @author Georg Fischer
 */
public class A055332 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055332() {
    super(8, A055278.computeRecurrence(7), "12, 145, 911, 4121, 15029, 47022, 130895, 332175, 781542, 1726194, 3612937, 7218784, 13849864, 25637680, 45969845, 80105273, 136036089, 225677767, 366486971, 583634189, 912883787, 1404372594, 2127513223, 3177300763, 4682348619, 6815048911, 9804315083, 13951455174, 19649804623, 27408864176, 37883790831, 51911237188, 70552663383", 0);
  }
}

