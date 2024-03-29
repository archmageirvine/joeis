package irvine.oeis.a107;
// Generated by gen_seq4.pl triselect/triprod at 2022-04-01 23:31

import irvine.oeis.triangle.Product;

/**
 * A107880 Matrix square of triangle A107876; equals matrix product of triangles: A107876^2 = A107862^-1*A107870 = A107867^-1*A107873.
 * @author Georg Fischer
 */
public class A107880 extends Product {

  /** Construct the sequence. */
  public A107880() {
    super(new A107876(), new A107876());
  }
}
