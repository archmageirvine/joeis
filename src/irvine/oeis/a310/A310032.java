package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310032 Coordination sequence Gal.4.28.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310032 extends TilingSequence {

  /** Construct the sequence. */
  public A310032() {
    super(0, new String[]
        { "12.6.4;A180-1,B120-2,A0-3"
        , "12.6.4;B180-1,A120-2,C210-2"
        , "6.4.4.3;C180-1,B210-3,C240-3,D210+4"
        , "6.4.3.4;D60+2,D300+1,C330-4,C150+4"
        });
    defineBaseSet(0);
  }
}
