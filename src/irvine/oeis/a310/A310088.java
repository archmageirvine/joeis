package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310088 Coordination sequence Gal.4.35.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310088 extends TilingSequence {

  /** Construct the sequence. */
  public A310088() {
    super(0, new String[]
        { "12.12.3;B30+2,A180+2,B270-2"
        , "12.3.4.3;B180-1,A330+1,B240-3,C330+3"
        , "4.3.4.3.3;C300+4,B210-4,B30+4,C60+1,D0+3"
        , "3.3.3.3.3.3;C240+5,C300+5,C0+5,C60+5,C120+5,C180+5"
        });
    defineBaseSet(0);
  }
}
