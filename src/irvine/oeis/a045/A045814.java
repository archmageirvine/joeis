package irvine.oeis.a045;

/**
 * A045814 Number of times the digits are repeated in A045813.
 * @author Sean A. Irvine
 */
public class A045814 extends A045812 {

  /** Construct the sequence. */
  public A045814() {
    super(1);
  }

  @Override
  protected int base() {
    return 4;
  }
}

