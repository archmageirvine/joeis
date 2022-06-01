package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095155 Number of 6-block covers of a labeled n-set.
 * @author Sean A. Irvine
 */
public class A095155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095155() {
    super(new long[] {-615195, 978768, -428787, 69688, -4593, 120}, new long[] {7, 4977, 711326, 63602770, 4709047749L, 320401872035L});
  }
}
