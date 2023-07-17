package irvine.oeis.a046;

/**
 * A046234 Cubes which are palindromes in base 5.
 * @author Sean A. Irvine
 */
public class A046234 extends A046232 {

  /** Construct the sequence. */
  public A046234() {
    super(0);
  }

  @Override
  protected int base() {
    return 5;
  }
}
