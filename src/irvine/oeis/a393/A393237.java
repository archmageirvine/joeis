package irvine.oeis.a393;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002473;

/**
 * A393237 allocated for Zhicheng Wei.
 * @author Sean A. Irvine
 */
public class A393237 extends FilterSequence {

  /** Construct the sequence. */
  public A393237() {
    super(1, new A002473(), k -> k.add(11).isProbablePrime()
      && k.add(13).isProbablePrime()
      && k.add(17).isProbablePrime()
      && k.add(19).isProbablePrime()
    );
  }
}
