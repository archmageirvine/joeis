package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051181 Number of 4-element intersecting families of an n-element set.
 * @author Sean A. Irvine
 */
public class A051181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051181() {
    super(new long[] {-696729600, 2142305280, -2749917312L, 1982352768, -904270136, 277278100, -58966886, 8804499, -919413, 65670, -3052, 83}, new long[] {0, 0, 0, 4, 365, 11770, 278455, 5715094, 108498285, 1963243930, 34404675635L, 589459538734L});
  }
}
