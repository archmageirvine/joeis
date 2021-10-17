package irvine.oeis.a123;
// manually 2021-10-14

import irvine.oeis.a011.A011971;
import irvine.oeis.triangle.Transpose;

/**
 * A123346 Transpose image of the Bell triangle A011971, which is also called the Pierce triangle or Aitken&apos;s array. 
 * @author Georg Fischer
 */
public class A123346 extends Transpose {

  /** Construct the sequence. */
  public A123346() {
    super(new A011971());
  }
}
