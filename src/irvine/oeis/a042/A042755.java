package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042755 Denominators of continued fraction convergents to sqrt(908).
 * @author Sean A. Irvine
 */
public class A042755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042755() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 204302, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 7, 8, 15, 218, 233, 451, 3390, 203851, 1430347, 1634198, 3064545, 44537828, 47602373, 92140201, 692583780});
  }
}
