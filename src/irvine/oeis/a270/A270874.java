package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270874.
 * @author Sean A. Irvine
 */
public class A270874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270874() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {34, 26259, 294888, 2528263, 16531326, 84603579, 353479684, 1252968303, 3885899418L, 10799026531L, 27392790624L});
  }
}
