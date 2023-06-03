package irvine.oeis.a166;
// manually triprod at 2023-05-30 13:31

import irvine.oeis.a007.A007318;
import irvine.oeis.a047.A047999;
import irvine.oeis.triangle.Product;

/**
 * A166548 Triangle read by rows, A047999 * A007318; (Sierpinski&apos;s gasket * Pascal&apos;s triangle).
 * @author Georg Fischer
 */
public class A166548 extends Product {

  /** Construct the sequence. */
  public A166548() {
    super(0, new A047999(), new A007318());
  }
}
