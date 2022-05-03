package irvine.oeis.a056;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002808;

/**
 * A056653 Composite numbers together with 1 but excluding 4.
 * @author Sean A. Irvine
 */
public class A056653 extends PrependSequence {

  /** Construct the sequence. */
  public A056653() {
    super(new SkipSequence(new A002808(), 1), 1);
  }
}
