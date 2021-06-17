package irvine.oeis.a048;

/**
 * A048423 Squares composed of two '2-digit' overlapping subsquares.
 * @author Sean A. Irvine
 */
public class A048423 extends A048421 {

  @Override
  protected int overlap() {
    return 2;
  }
}
