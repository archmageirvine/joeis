package irvine.oeis.a342;

import irvine.oeis.a369.A369290;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A342556 a(n) is the number of unlabeled connected graphs without endpoints with n edges.
 * @author Gregory Morse
 */
public class A342556 extends InverseEulerTransform {
  /** Construct the sequence. */
  public A342556() {
    super(new A369290(), 1);
  }
}
