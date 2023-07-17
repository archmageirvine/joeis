package irvine.oeis.a046;

/**
 * A046250 Cubes which are palindromes in base 14.
 * @author Sean A. Irvine
 */
public class A046250 extends A046232 {

  /** Construct the sequence. */
  public A046250() {
    super(0);
  }

  @Override
  protected int base() {
    return 14;
  }
}
