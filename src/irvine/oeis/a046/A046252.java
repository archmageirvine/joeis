package irvine.oeis.a046;

/**
 * A046252 Cubes which are palindromes in base 15.
 * @author Sean A. Irvine
 */
public class A046252 extends A046232 {

  /** Construct the sequence. */
  public A046252() {
    super(0);
  }

  @Override
  protected int base() {
    return 15;
  }
}
