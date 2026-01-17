package irvine.oeis.a392;

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a039.A039956;

/**
 * A392262 Even composite numbers that are squarefree or powers of 2.
 * @author Sean A. Irvine
 */
public class A392262 extends UnionSequence {

  /** Construct the sequence. */
  public A392262() {
    super(1, new A000079().skip(2), new A039956().skip());
  }
}

