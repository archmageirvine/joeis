package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042285 Denominators of continued fraction convergents to sqrt(668).
 * @author Sean A. Irvine
 */
public class A042285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042285() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 112894, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 6, 13, 162, 337, 1847, 2184, 111047, 113231, 677202, 1467635, 18288822, 38045279, 208515217, 246560496});
  }
}
