package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124087 9th column of Catalan triangle <code>A009766</code>.
 * @author Sean A. Irvine
 */
public class A124087 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124087() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1430, 4862, 11934, 25194, 48450, 87210, 149226, 245157, 389367});
  }
}
