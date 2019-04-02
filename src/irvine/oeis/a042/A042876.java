package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042876 Numerators of continued fraction convergents to sqrt(970).
 * @author Sean A. Irvine
 */
public class A042876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042876() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 656346, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {31, 187, 218, 2149, 2367, 4516, 43011, 47527, 328173, 20394253, 122693691, 143087944, 1410485187, 1553573131, 2964058318L, 28230097993L, 31194156311L, 215395035859L});
  }
}
