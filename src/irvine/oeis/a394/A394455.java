package irvine.oeis.a394;

import irvine.oeis.InterleaveSequence;
import irvine.oeis.a002.A002426;
import irvine.oeis.a005.A005773;

/**
 * A394455 allocated for Yi-Zhong Wang.
 * @author Sean A. Irvine
 */
public class A394455 extends InterleaveSequence {

  /** Construct the sequence. */
  public A394455() {
    super(1, new A005773().skip(), new A002426().skip());
  }
}

