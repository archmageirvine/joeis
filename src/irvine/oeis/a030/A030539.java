package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030539 (2^n+1)*(2^n+2)*(2^n+4)*(2^n+6)*(4^n+15*2^n+176)/8!.
 * @author Sean A. Irvine
 */
public class A030539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030539() {
    super(new long[] {2097152, -4161536, 2731008, -755904, 94488, -5334, 127}, new long[] {1, 3, 15, 135, 2244, 63954, 2649790});
  }
}
