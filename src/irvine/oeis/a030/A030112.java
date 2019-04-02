package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030112 Number of distributive lattices; also number of paths with n turns when light is reflected from 8 glass plates.
 * @author Sean A. Irvine
 */
public class A030112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030112() {
    super(new long[] {-1, -1, 7, 6, -15, -10, 10, 4}, new long[] {1, 8, 36, 204, 1086, 5916, 31998, 173502});
  }
}
