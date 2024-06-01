package irvine.oeis.a070;

import irvine.oeis.Combiner;

/**
 * A070036 a(n)=A070034(n)-A070035(n).
 * @author Sean A. Irvine
 */
public class A070036 extends Combiner {

  /** Construct the sequence. */
  public A070036() {
    super(1, new A070034(), new A070035(), SUBTRACT);
  }
}
