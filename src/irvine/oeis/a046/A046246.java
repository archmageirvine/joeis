package irvine.oeis.a046;

/**
 * A046246 Cubes which are palindromes in base 12.
 * @author Sean A. Irvine
 */
public class A046246 extends A046232 {

  /** Construct the sequence. */
  public A046246() {
    super(0);
  }

  @Override
  protected int base() {
    return 12;
  }
}
