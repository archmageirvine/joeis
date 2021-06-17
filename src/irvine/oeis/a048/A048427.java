package irvine.oeis.a048;

/**
 * A048427 Squares composed of three '2 digit' overlapping subsquares.
 * @author Sean A. Irvine
 */
public class A048427 extends A048425 {

  @Override
  protected int overlap() {
    return 2;
  }
}
