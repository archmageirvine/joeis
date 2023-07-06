package irvine.oeis.a056;
// manually A060164/parm2 at 2022-03-25 13:13

/**
 * A056496 Number of primitive (period n) periodic palindromes using a maximum of five different symbols.
 * @author Georg Fischer
 */
public class A056496 extends A056267 {

  /** Construct the sequence. */
  public A056496() {
    super(new A056487().skip(1));
  }
}
