package irvine.oeis.a075;

import irvine.oeis.PrependSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075616.
 * @author Sean A. Irvine
 */
public class A075633 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075633() {
    super(1, new PrependSequence(new A075634(), 0), k -> k.add(1));
  }
}
