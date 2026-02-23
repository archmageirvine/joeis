package irvine.oeis.a391;

import irvine.oeis.Combiner;
import irvine.oeis.a046.A046868;
import irvine.oeis.a233.A233671;

/**
 * A391658 a(n) = A233671(n) - A046868(n).
 * @author Sean A. Irvine
 */
public class A391658 extends Combiner {

  /** Construct the sequence. */
  public A391658() {
    super(1, new A233671(), new A046868(), SUBTRACT);
  }
}
