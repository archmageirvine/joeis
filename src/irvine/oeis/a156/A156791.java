package irvine.oeis.a156;

import irvine.oeis.a006.A006973;
import irvine.oeis.transform.InverseInvertTransform;

/**
 * A156791 INVERTi transform of A006973.
 * @author Georg Fischer
 */
public class A156791 extends InverseInvertTransform {

  /** Construct the sequence. */
  public A156791() {
    super(1, new A006973(), 1);
  }
}
