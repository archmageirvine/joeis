package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042676 Numerators of continued fraction convergents to sqrt(868).
 * @author Sean A. Irvine
 */
public class A042676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042676() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 7688126, 0, 0, 0, 0, 0, 0, 0}, new long[] {29, 59, 383, 7336, 15055, 293381, 1775341, 3844063, 224730995, 453306053, 2944567313L, 56400085000L, 115744737313L, 2255550093947L, 13649045300995L, 29553640695937L});
  }
}
