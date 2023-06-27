package irvine.oeis.a075;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A075668 Sum of next n 7th powers.
 * @author Sean A. Irvine
 */
public class A075668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075668() {
    super(1, new long[] {-1, 16, -120, 560, -1820, 4368, -8008, 11440, -12870, 11440, -8008, 4368, -1820, 560, -120, 16}, new long[] {1, 2315, 374445, 17703664, 394340375, 5265954441L, 48574262275L, 338837482880L, 1900477947429L, 8950536157375L, 36536761179281L, 132397570996560L, 433806511149115L, 1303971065324669L, 3637715990646375L, 9507513902672896L});
  }
}
