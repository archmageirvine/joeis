package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042818 Numerators of continued fraction convergents to sqrt(940).
 * @author Sean A. Irvine
 */
public class A042818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042818() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 8462, 0, 0, 0, 0, 0, 0, 0}, new long[] {30, 31, 61, 92, 1349, 1441, 2790, 4231, 256650, 260881, 517531, 778412, 11415299, 12193711, 23609010, 35802721});
  }
}
