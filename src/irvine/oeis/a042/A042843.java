package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042843 Denominators of continued fraction convergents to sqrt(952).
 * @author Sean A. Irvine
 */
public class A042843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042843() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 23326, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 6, 7, 48, 55, 323, 378, 23003, 23381, 139908, 163289, 1119642, 1282931, 7534297, 8817228});
  }
}
