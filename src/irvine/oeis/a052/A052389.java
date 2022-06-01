package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052389 Number of 4-element intersecting families (with not necessary distinct sets) of an n-element set.
 * @author Sean A. Irvine
 */
public class A052389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052389() {
    super(new long[] {-696729600, 2142305280, -2749917312L, 1982352768, -904270136, 277278100, -58966886, 8804499, -919413, 65670, -3052, 83}, new long[] {0, 1, 9, 95, 1286, 20681, 360964, 6452825, 114920766, 2018035121, 34864971944L, 593281456505L});
  }
}
