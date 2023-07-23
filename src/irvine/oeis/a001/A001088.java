package irvine.oeis.a001;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000010;

/**
 * A001088 Product of totient function: a(n) = Product_{k=1..n} phi(k) (cf. A000010).
 * @author Sean A. Irvine
 */
public class A001088 extends PartialProductSequence {

  /** Construct the sequence. */
  public A001088() {
    super(0, new PrependSequence(new A000010(), 1));
  }
}

