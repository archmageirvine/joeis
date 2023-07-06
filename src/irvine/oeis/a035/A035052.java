package irvine.oeis.a035;

import irvine.oeis.a007.A007563;
import irvine.oeis.transform.EulerTransform;

/**
 * A035052 Number of sets of rooted connected graphs where every block is a complete graph.
 * @author Sean A. Irvine
 */
public class A035052 extends EulerTransform {

  /** Construct the sequence. */
  public A035052() {
    super(new A007563().skip(1), 1);
  }
}
