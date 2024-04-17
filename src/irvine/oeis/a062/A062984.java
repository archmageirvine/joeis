package irvine.oeis.a062;

import irvine.oeis.NestedSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002321;
import irvine.oeis.a048.A048050;

/**
 * A062984 a(n) = M(C(n)), where M(n) is Mertens's function (A002321) and C(n) is Chowla's function (A048050).
 * @author Sean A. Irvine
 */
public class A062984 extends NestedSequence {

  /** Construct the sequence. */
  public A062984() {
    super(0, new PrependSequence(new A002321(), 0), new A048050(), 0, 0);
    setOffset(1);
  }
}

