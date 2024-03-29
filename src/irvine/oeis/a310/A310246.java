package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310246 Coordination sequence Gal.3.1.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310246 extends TilingSequence {

  /** Construct the sequence. */
  public A310246() {
    super(0, new String[]
        { "6.6.6;A60+2,A300+1,B300+2"
        , "6.6.3.3;C60+2,A60+3,C240+3,B180+4"
        , "6.3.6.3;C240+4,B300+1,B120+3,C120+1"
        });
    defineBaseSet(0);
  }
}
