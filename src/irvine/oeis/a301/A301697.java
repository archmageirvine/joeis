package irvine.oeis.a301;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A301697 Coordination sequence for node of type V2 in "krj" 2-D tiling (or net).
 * @author Georg Fischer
 */
public class A301697 extends TilingSequence {

  /** Construct the sequence. */
  public A301697() {
    super(0, new String[]
        { "4.4.3.3.3;A0+3,B180+2,A0+1,A180+4,A180+5"
        , "4.4.3.3.3;B0+3,A180+2,B0+1,C0+2,C0+3"
        , "3.3.3.3.3.3;C0+4,B0+4,B0+5,C0+1,C180+5,C180+6"
        });
    defineBaseSet(0);
  }
}
