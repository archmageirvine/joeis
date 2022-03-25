package irvine.oeis.a056;
// manually A060164/parm2 at 2022-03-25 13:04

import irvine.oeis.PrependSequence;

/**
 * A056479 Number of primitive (aperiodic) palindromic structures using a maximum of five different symbols.
 * @author Georg Fischer
 */
public class A056479 extends PrependSequence {

  /** Construct the sequence. */
  public A056479() {
    super(new A056271(new A056470()), 1);
  }
}
