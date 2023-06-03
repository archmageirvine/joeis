package irvine.oeis.a132;

import irvine.oeis.a130.A130595;
import irvine.oeis.triangle.Product;

/**
 * A132814 A007318^(-1) * A132813.
 * @author Georg Fischer
 */
public class A132814 extends Product {

  /** Construct the sequence. */
  public A132814() {
    super(0, new A130595(), new A132813());
  }
}
