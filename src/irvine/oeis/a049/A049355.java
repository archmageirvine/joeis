package irvine.oeis.a049;

/**
 * A049355 Digitally balanced numbers in base 4: equal numbers of 0's, 1's, ... 3's.
 * @author Sean A. Irvine
 */
public class A049355 extends A049354 {

  /** Construct the sequence. */
  public A049355() {
    super(1);
  }

  @Override
  protected int base() {
    return 4;
  }
}
