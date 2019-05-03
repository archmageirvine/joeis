package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240445 Numbers of ways to place five indistinguishable points on an <code>n X n</code> square grid so that no four of them are vertices of a square of any orientation.
 * @author Sean A. Irvine
 */
public class A240445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240445() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {96, 4128, 52080, 373632, 1898064, 7604352, 25580016, 75208320, 198651024, 480768288, 1081848768});
  }
}
