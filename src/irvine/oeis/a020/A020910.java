package irvine.oeis.a020;

/**
 * A020910 Number of terms in Zeckendorf representation of 3^n.
 * @author Sean A. Irvine
 */
public class A020910 extends A020908 {

  @Override
  protected long base() {
    return 3;
  }
}
