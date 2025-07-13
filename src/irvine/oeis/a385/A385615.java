package irvine.oeis.a385;

/**
 * A385615 Star numbers corresponding to the point numbers in A385330.
 * @author Sean A. Irvine
 */
public class A385615 extends A385330 {

  @Override
  protected int select(final int star, final int label) {
    return star;
  }
}

